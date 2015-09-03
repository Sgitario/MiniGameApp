package org.jcarvajal.minigame.service.impl;

import org.jcarvajal.framework.di.annotations.Autowired;
import org.jcarvajal.minigame.infrastructure.ScoreRepository;
import org.jcarvajal.minigame.service.ScoreService;

public class ScoreServiceImpl implements ScoreService {
	@Autowired
	private ScoreRepository scoreRepository;
	
	public void setScoreRepository(ScoreRepository scoreRepository) {
		this.scoreRepository = scoreRepository;
	}
	
	public ScoreRepository getScoreRepository() {
		return scoreRepository;
	}
}