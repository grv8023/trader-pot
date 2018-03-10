package com.traderpot.tracker.core;

import java.util.List;

import com.traderpot.coin.core.ICoin;

public interface IMovementTracker {

	public void handleCurrentSnapshot(List<ICoin> coinList);
	
}
