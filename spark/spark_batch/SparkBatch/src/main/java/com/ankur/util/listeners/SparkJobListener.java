package com.ankur.util.listeners;

import org.apache.spark.scheduler.SparkListenerApplicationEnd;
import org.apache.spark.scheduler.SparkListenerApplicationStart;
import org.apache.spark.scheduler.SparkListenerBlockManagerAdded;
import org.apache.spark.scheduler.SparkListenerBlockManagerRemoved;
import org.apache.spark.scheduler.SparkListenerBlockUpdated;
import org.apache.spark.scheduler.SparkListenerEnvironmentUpdate;
import org.apache.spark.scheduler.SparkListenerEvent;
import org.apache.spark.scheduler.SparkListenerExecutorAdded;
import org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate;
import org.apache.spark.scheduler.SparkListenerExecutorRemoved;
import org.apache.spark.scheduler.SparkListenerInterface;
import org.apache.spark.scheduler.SparkListenerJobEnd;
import org.apache.spark.scheduler.SparkListenerJobStart;
import org.apache.spark.scheduler.SparkListenerStageCompleted;
import org.apache.spark.scheduler.SparkListenerStageSubmitted;
import org.apache.spark.scheduler.SparkListenerTaskEnd;
import org.apache.spark.scheduler.SparkListenerTaskGettingResult;
import org.apache.spark.scheduler.SparkListenerTaskStart;
import org.apache.spark.scheduler.SparkListenerUnpersistRDD;

public class SparkJobListener implements SparkListenerInterface {

	@Override
	public void onApplicationEnd(SparkListenerApplicationEnd arg0) {

	}

	@Override
	public void onApplicationStart(SparkListenerApplicationStart arg0) {

	}

	@Override
	public void onBlockManagerAdded(SparkListenerBlockManagerAdded arg0) {

	}

	@Override
	public void onBlockManagerRemoved(SparkListenerBlockManagerRemoved arg0) {

	}

	@Override
	public void onBlockUpdated(SparkListenerBlockUpdated arg0) {

	}

	@Override
	public void onEnvironmentUpdate(SparkListenerEnvironmentUpdate arg0) {

	}

	@Override
	public void onExecutorAdded(SparkListenerExecutorAdded arg0) {

	}

	@Override
	public void onExecutorMetricsUpdate(SparkListenerExecutorMetricsUpdate arg0) {

	}

	@Override
	public void onExecutorRemoved(SparkListenerExecutorRemoved arg0) {

	}

	@Override
	public void onJobEnd(SparkListenerJobEnd arg0) {

	}

	@Override
	public void onJobStart(SparkListenerJobStart arg0) {

	}

	@Override
	public void onOtherEvent(SparkListenerEvent arg0) {

	}

	@Override
	public void onStageCompleted(SparkListenerStageCompleted arg0) {

	}

	@Override
	public void onStageSubmitted(SparkListenerStageSubmitted arg0) {

	}

	@Override
	public void onTaskEnd(SparkListenerTaskEnd arg0) {

	}

	@Override
	public void onTaskGettingResult(SparkListenerTaskGettingResult arg0) {

	}

	@Override
	public void onTaskStart(SparkListenerTaskStart arg0) {

	}

	@Override
	public void onUnpersistRDD(SparkListenerUnpersistRDD arg0) {

	}

}
