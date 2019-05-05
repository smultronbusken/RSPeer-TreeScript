package com.smultron.treescript;

import org.rspeer.script.LoopTask;

public abstract class TreeScript extends LoopTask
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
	task.execute();
	return 0;
    }

    public abstract TreeTask onCreateRoot();

    public final void setNewRootTask(TreeTask task) {
        this.task = task;
    }

}
