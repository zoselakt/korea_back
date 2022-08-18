package com.medici.arang.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medici.arang.user.command.ArtistCommand;
import com.medici.arang.user.dao.ArtistDao;
import com.medici.arang.user.domain.Artist;


public class ArtistServiceImpl implements ArtistService {
	
	@Autowired
	ArtistDao artistDao;
	
	@Override
	public void addArtist(ArtistCommand artistCommand) {
		artistDao.addArtist(artistCommand);
	}
	
	public boolean isValidUser(String email, String passwd) {
		return artistDao.isValidUser(email, passwd);
	}

	@Override
	public List<ArtistCommand> getAllArtist() {
		return artistDao.getAllArtist();
	}

	@Override
	public ArtistCommand getArtistByEmail(String email) {
		return artistDao.getArtistByEmail(email);
	}
	
}
