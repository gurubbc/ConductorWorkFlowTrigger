package com.ofss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.netflix.conductor.client.automator.TaskRunnerConfigurer;
import com.netflix.conductor.client.http.TaskClient;
import com.netflix.conductor.client.worker.Worker;
import io.orkes.conductor.client.ApiClient;
import io.orkes.conductor.client.http.OrkesTaskClient;


@SpringBootApplication
public class KannanConductorDemo2 {

	@Autowired
	Environment env;
	
	
	public static void main(String[] args) {
		SpringApplication.run(KannanConductorDemo2.class, args);
		System.out.println("SpringBoot Conductor with authentication started....");
	}
	
	@Bean
	public TaskRunnerConfigurer taskRunnerConfigurer(List<Worker> workersList) {
		System.out.println("1 main...Entering taskRunnerConfigure....");
		TaskClient taskClient = new TaskClient();
		String url=env.getProperty("conductor.server.url");
		System.out.println("Conductor url "+url);
		taskClient.setRootURI(url); // Point this to the server API
		TaskRunnerConfigurer runnerConfigurer=new TaskRunnerConfigurer
				.Builder(taskClient, workersList)
				.withThreadCount(Math.max(1,workersList.size()))
				.build();
		runnerConfigurer.init();
		return runnerConfigurer;
	}

}
