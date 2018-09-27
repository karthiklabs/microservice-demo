package com.piggymetrics.notification.controller;

import com.piggymetrics.notification.domain.Recipient;
import com.piggymetrics.notification.service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/recipients")
public class RecipientController {
	private static final Logger LOG = LoggerFactory.getLogger(RecipientController.class.getName());

	@Autowired
	private RecipientService recipientService;

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Object getCurrentNotificationsSettings(Principal principal) {
		LOG.info("getCurrentNotificationsSettings");
		return recipientService.findByAccountName(principal.getName());
	}

	@RequestMapping(path = "/current", method = RequestMethod.PUT)
	public Object saveCurrentNotificationsSettings(Principal principal, @Valid @RequestBody Recipient recipient) {
		LOG.info("saveCurrentNotificationsSettings");
		return recipientService.save(principal.getName(), recipient);
	}
}
