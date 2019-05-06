package com.smultron.treescript;

public abstract class TreeTask
{

    // Returns this task if validate() should return false.
    public abstract TreeTask failureTask();

    // Returns this task if validate() should return true.
    public abstract TreeTask successTask();

    public abstract boolean isLeaf();

    public abstract int execute();

    public abstract boolean validate();
}
