package com.cts.project.config;



	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.cloud.context.config.annotation.RefreshScope;
	import org.springframework.stereotype.Component;

	@Component
	@RefreshScope
	public class ServiceConfig {

		@Value("${authUsername1}")
		private String Username1;
		
		@Value("${authPassword1}")
		private String Password1;
	
		public String getUsername1() {
			return Username1;
		}

		public String getPassword1() {
			return Password1;
		}
		
		@Value("${authUsername}")
		private String Username;
		
		@Value("${authPassword}")
		private String Password;
		

		public String getUsername() {
			return Username;
		}

		public String getPassword() {
			return Password;
		}

		
	}


