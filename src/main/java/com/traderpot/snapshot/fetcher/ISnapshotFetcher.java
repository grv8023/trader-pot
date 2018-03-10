package com.traderpot.snapshot.fetcher;

import org.springframework.scheduling.annotation.Scheduled;

public interface ISnapshotFetcher {
	
	@Scheduled
	public void fetchCurrentSnapshot();

}
