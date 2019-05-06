package com.smultron.treescript.Example;

import com.smultron.treescript.Example.branches.InTreeArea;
import com.smultron.treescript.TreeScript;
import com.smultron.treescript.TreeTask;
import org.rspeer.script.ScriptMeta;

@ScriptMeta(developer = "Smultron", desc = "Example for using the TreeScript class. Chops wood at Lumbridge general store. Equip axe before starting.", name = "TreeScript Example")
public class EpicTreeScript extends TreeScript
{
    @Override public TreeTask onCreateRoot() {
	return new InTreeArea();
    }
}
