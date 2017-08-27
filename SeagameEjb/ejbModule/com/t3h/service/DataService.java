package com.t3h.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.t3h.dto.TeamDTO;
import com.t3h.util.AppUtils;
@Stateless
@LocalBean
public class DataService implements DataServiceLocal, DataServiceRemote {

	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceLocal#getTeamByStatus(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceRemote#getTeamByStatus(java.lang.String)
	 */
	@Override
	public List<TeamDTO> getTeamByStatus(String status) {

		List<TeamDTO> lst = AppUtils.getTeamData();
		for (int i = lst.size() - 1; i >= 0; i--) {
			if ("active".equals(lst.get(i).getTeamStatus()) == false) {
				lst.remove(i);
			}
		}
		return lst;
	}

	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceLocal#getTeamByConditions(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceRemote#getTeamByConditions(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<TeamDTO> getTeamByConditions(String teamCode, String teamName, String desciption, String status) {

		List<TeamDTO> lst = AppUtils.getTeamData();
		List<TeamDTO> result = new ArrayList<>();
		for (TeamDTO teamDTO : lst) {
			if (teamCode != null && teamCode.isEmpty() == false && teamDTO.getTeamCode().contains(teamCode)) {
				result.add(teamDTO);
			}
			if (teamName != null && teamName.isEmpty() == false && teamDTO.getTeamName().contains(teamName)) {
				result.add(teamDTO);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceLocal#addTeam(com.t3h.dto.TeamDTO)
	 */
	/* (non-Javadoc)
	 * @see com.t3h.service.DataServiceRemote#addTeam(com.t3h.dto.TeamDTO)
	 */
	@Override
	public void addTeam(TeamDTO team) {
		AppUtils.addTeam(team);
	}
}
