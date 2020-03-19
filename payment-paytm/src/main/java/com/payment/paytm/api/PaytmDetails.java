package com.payment.paytm.api;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties("paytm.payment.sandbox")
public class PaytmDetails {
	private String merchantId;
	private String merchantKey;
	private String channelId;
	private  String website;
	private  String industryTypeId;
	private  String paytmUrl;
	private  String callbackUrl;
	
	 private Map<String, String> details;
}
