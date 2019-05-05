package com.smultron.treescript;

public abstract class BranchTask extends TreeTask
{
    public BranchTask() {
    }

    public final boolean isLeaf() {
        return false;
    }
}
