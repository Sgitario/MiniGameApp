package org.jcarvajal.minigame.service.impl;

import org.jcarvajal.framework.di.annotations.Autowired;
import org.jcarvajal.minigame.infrastructure.SessionRepository;
import org.jcarvajal.minigame.service.SessionService;

public class SessionServiceImpl implements SessionService {
	@Autowired
	private SessionRepository sessionRepository;
}