//package com.ofss;
//
//import org.springframework.stereotype.Component;
//
//import com.netflix.conductor.client.worker.Worker;
//import com.netflix.conductor.common.metadata.tasks.Task;
//import com.netflix.conductor.common.metadata.tasks.TaskResult;
//
//@Component
//public class HelloWorldTestWorker implements Worker{
//	public String getTaskDefName() {
//		System.out.println("2 HelloWorldTestWorker getTaskDefName");
////		return "hello__task";
//		return "getCustomerTask";
//	}
//
//	
//	public TaskResult execute(Task task) {
//		System.out.println("4 HelloWolrdTestWorker......execute.......");
//		TaskResult result=new TaskResult(task);
//		String name=(String)task.getInputData().get("name");
//		if (name.contains("Guru"))
//			result.addOutputData("message", "Hello World Trainer "+name);
//		else
//			result.addOutputData("message", "Hello World Leaner "+name);
//		result.setStatus(TaskResult.Status.COMPLETED);
//		return result;
//	}
//	
//
//
//}
