package com.ofss;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.conductor.client.http.TaskClient;
import com.netflix.conductor.common.metadata.workflow.StartWorkflowRequest;
import com.netflix.conductor.common.model.BulkResponse;
import com.netflix.conductor.common.run.Workflow;
import com.netflix.conductor.common.run.WorkflowTestRequest;

import io.orkes.conductor.client.WorkflowClient;
import io.orkes.conductor.client.http.ApiException;
import io.orkes.conductor.client.model.WorkflowStatus;
import io.orkes.conductor.common.model.WorkflowRun;

@RestController
public class MyController {


	public MyController(WorkflowClient workflowClient) {
		super();
		this.workflowClient = workflowClient;
	}





	public MyController() {
		super();
		// TODO Auto-generated constructor stub
	}





	WorkflowClient workflowClient;


	public WorkflowClient getWorkflowClient() {
		return workflowClient;
	}





	public void setWorkflowClient(WorkflowClient workflowClient) {
		this.workflowClient = workflowClient;
	}





	@RequestMapping(value="/triggerWorkFlow", method=RequestMethod.GET)
	public String triggerWorkFlow() {
				
		workflowClient=new WorkflowClient() {
			
			@Override
			public void uploadCompletedWorkflows() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Workflow updateVariables(String workflowId, Map<String, Object> variables) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Workflow testWorkflow(WorkflowTestRequest testRequest) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse terminateWorkflowsWithFailure(List<String> workflowIds, String reason,
					boolean triggerWorkflowFailure) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void terminateWorkflowWithFailure(String workflowId, String reason, boolean triggerWorkflowFailure)
					throws ApiException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public BulkResponse terminateWorkflow(List<String> workflowIds, String reason) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void shutdown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public BulkResponse retryWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse resumeWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse restartWorkflow(List<String> workflowIds, Boolean useLatestDefinitions) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse pauseWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, List<Workflow>> getWorkflowsByNamesAndCorrelationIds(List<String> correlationIds,
					List<String> workflowNames, Boolean includeClosed, Boolean includeTasks) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WorkflowStatus getWorkflowStatusSummary(String workflowId, Boolean includeOutput, Boolean includeVariables) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WorkflowRun executeWorkflow(StartWorkflowRequest request, String waitUntilTask, Duration waitTimeout)
					throws ExecutionException, InterruptedException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CompletableFuture<WorkflowRun> executeWorkflow(StartWorkflowRequest request, String waitUntilTask,
					Integer waitForSeconds) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CompletableFuture<WorkflowRun> executeWorkflow(StartWorkflowRequest request, String waitUntilTask) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		TaskClient taskClient = new TaskClient();
		taskClient.setRootURI("http://localhost:8080/api/");
//        taskClient.setRootURI(rootUri);  // Set the root URI for the Conductor server
        
        WorkflowClient workflowClient = new WorkflowClient() {
			
			@Override
			public void uploadCompletedWorkflows() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Workflow updateVariables(String workflowId, Map<String, Object> variables) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Workflow testWorkflow(WorkflowTestRequest testRequest) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse terminateWorkflowsWithFailure(List<String> workflowIds, String reason,
					boolean triggerWorkflowFailure) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void terminateWorkflowWithFailure(String workflowId, String reason, boolean triggerWorkflowFailure)
					throws ApiException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public BulkResponse terminateWorkflow(List<String> workflowIds, String reason) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void shutdown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public BulkResponse retryWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse resumeWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse restartWorkflow(List<String> workflowIds, Boolean useLatestDefinitions) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BulkResponse pauseWorkflow(List<String> workflowIds) throws ApiException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, List<Workflow>> getWorkflowsByNamesAndCorrelationIds(List<String> correlationIds,
					List<String> workflowNames, Boolean includeClosed, Boolean includeTasks) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WorkflowStatus getWorkflowStatusSummary(String workflowId, Boolean includeOutput, Boolean includeVariables) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WorkflowRun executeWorkflow(StartWorkflowRequest request, String waitUntilTask, Duration waitTimeout)
					throws ExecutionException, InterruptedException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CompletableFuture<WorkflowRun> executeWorkflow(StartWorkflowRequest request, String waitUntilTask,
					Integer waitForSeconds) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CompletableFuture<WorkflowRun> executeWorkflow(StartWorkflowRequest request, String waitUntilTask) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		// Don't hard code, read this from application.properties
        workflowClient.setRootURI("https://play.orkes.io/api/");  // Similarly, set the root URI for the workflow client
        
        // Prepare the workflow start request
        StartWorkflowRequest startWorkflowRequest = new StartWorkflowRequest();
		startWorkflowRequest.setName("guru_sequential_http");
//		StartWorkflowRequest startWorkflowRequest = new StartWorkflowRequest()
//                .withName("guru_sequential_http"); // Use your workflow name


        String workflowId = workflowClient.startWorkflow(startWorkflowRequest);
        
//		StartWorkflowRequest request = new StartWorkflowRequest();
//		request.setName("guru_sequential_http");
//		if (workflowClient==null) {
//			System.out.println("workflowclient is null");
//		} else {
//			System.out.println("workflowclient is not null");
//		}
//		String workflowId = workflowClient.startWorkflow(request);
		// docs-marker-end-1
//		Map<String, Object> map=new HashMap();
//		map.put("workflowId", workflowId);
//		return map;
        return "success, this is your workflow id "+workflowId;
	}
}
