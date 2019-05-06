package com.smultron.treescript.Example.leafs;

import com.smultron.treescript.LeafTask;
import org.rspeer.runetek.adapter.scene.SceneObject;
import org.rspeer.runetek.api.movement.position.Area;
import org.rspeer.runetek.api.scene.SceneObjects;
import org.rspeer.ui.Log;

public class ChopTree extends LeafTask
{

    @Override public int execute() {
	Log.info("Chopping...");
        final SceneObject tree = SceneObjects.getNearest("Tree");
	if (tree != null)
	    tree.interact("Chop down");
        return 300;
    }
}
