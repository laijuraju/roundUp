package com.starling.roundUp.requestController;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
/**
 * @author LAIJU
 *
 */
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starling.apis.models.AddMoneyResponse;
import com.starling.roundUp.ResponseModel.CommonResponse;
import com.starling.roundUp.requestModel.RoundUpRequestModel;
import com.starling.roundUp.services.RoundUpService;
/**
 * 
 * @author LAIJU
 *
 */
@RestController
public class RoundUpAPIController {
	Logger logger = Logger.getLogger(RoundUpAPIController.class.getName());

	@Autowired
	private RoundUpService service;

	@RequestMapping(method = RequestMethod.PUT, value = "/api/v2/account/roundUp")
	public ResponseEntity<CommonResponse> roundUp(@RequestBody RoundUpRequestModel request) {
		if (request != null) {
			logger.info("RoundUp Request Recevied...");
			final ResponseEntity<CommonResponse> response = service.roundUp(request);
			logger.info("RoundUp Request Completed...");
			//return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(new CommonResponse(true, response.getTransferUid().toString()));
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response.getBody());
		}
		
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(new CommonResponse(false,"Request can not be empty..!"));
	}

}
