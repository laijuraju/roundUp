package com.starling.roundUp.requestModel;

/**
 * @author LAIJU
 *
 */

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class RoundUpRequestModel {
	
	@NonNull
	private UUID accountUID;
	
	private UUID savingGoal;
	
	@NonNull
	@DateTimeFormat(iso = DATE_TIME) 
	private OffsetDateTime minTimestamp;
	
	@NonNull
	@DateTimeFormat(iso = DATE_TIME) 
	private OffsetDateTime maxTimestamp;

	public UUID getAccountUID() {
		return accountUID;
	}

	public void setAccountUID(UUID accountUID) {
		this.accountUID = accountUID;
	}

	public UUID getSavingGoal() {
		return savingGoal;
	}

	public void setSavingGoal(UUID savingGoal) {
		this.savingGoal = savingGoal;
	}

	public OffsetDateTime getMinTimestamp() {
		return minTimestamp;
	}

	public void setMinTimestamp(OffsetDateTime minTimestamp) {
		this.minTimestamp = minTimestamp;
	}

	public OffsetDateTime getMaxTimestamp() {
		return maxTimestamp;
	}

	public void setMaxTimestamp(OffsetDateTime maxTimestamp) {
		this.maxTimestamp = maxTimestamp;
	}
	

}
