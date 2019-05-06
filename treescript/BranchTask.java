package com.smultron.treescript;

public abstract class BranchTask extends TreeTask
{

    public BranchTask() {}

    // Use validate() for branch logic.
    public final int execute() {
        return 0;
    }

    public final boolean isLeaf() {
        return false;
    }
}
