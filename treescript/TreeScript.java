package com.smultron.treescript;

import org.rspeer.script.Script;
import org.rspeer.ui.Log;

public abstract class TreeScript extends Script
{
    private TreeTask task;

    public TreeScript() {
    }

    @Override public int loop() {
	if(task == null) {
	    task = onCreateRoot();
	    if(task == null)
		throw new IllegalStateException("Root task is null.");
	}

	while(!task.isLeaf()){
	    if(task.validate()){
		task = task.successTask();
		if(task == null)
		    throw new IllegalStateException("Success is task null.");
	    } else {
		task = task.failureTask();
		if(task == null)
		    throw new IllegalStateException("Failure is task null.");
	    }
	}
	int returnValue = task.execute();
	task = null;
	return returnValue;
    }

    public abstract TreeTask onCreateRoot();

    public final void setNewRootTask(TreeTask task) {
        this.task = task;
    }

}
