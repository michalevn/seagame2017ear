package com.t3h.service;

import java.util.List;

import javax.ejb.Remote;

import com.t3h.dto.TeamDTO;

@Remote
public interface DataServiceRemote {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.t3h.service.DataServiceLocal#getTeamByStatus(java.lang.String)
	 */
	List<TeamDTO> getTeamByStatus(String status);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.t3h.service.DataServiceLocal#getTeamByConditions(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	List<TeamDTO> getTeamByConditions(String teamCode, String teamName, String desciption, String status);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.t3h.service.DataServiceLocal#addTeam(com.t3h.dto.TeamDTO)
	 */
	void addTeam(TeamDTO team);

}