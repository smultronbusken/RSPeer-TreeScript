package com.smultron.treescript;

import org.rspeer.script.task.Task;

public abstract class TreeTask extends Task
{

    public abstract TreeTask failureTask();

    public abstract TreeTask successTask();

    public abstract boolean isLeaf();

}
