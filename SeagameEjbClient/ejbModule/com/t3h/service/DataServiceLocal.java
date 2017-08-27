package com.t3h.service;

import java.util.List;

import javax.ejb.Local;

import com.t3h.dto.TeamDTO;

@Local
public interface DataServiceLocal {

	List<TeamDTO> getTeamByStatus(String status);

	List<TeamDTO> getTeamByConditions(String teamCode, String teamName, String desciption, String status);

	void addTeam(TeamDTO team);

}