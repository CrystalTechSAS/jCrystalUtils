package jcrystal.utils;

import java.util.ArrayList;

/**
 * Created by G on 11/8/2016.
 */
public class CodeBlock extends ArrayList<String> {

    private String prefijo = "";
    public final void $(String ins){
        this.add(ins);
    }
    public final void $(Block block){
        this.$("", block);
    }
    public final void $if(String cond, Block block){
        block.code = this;
        this.$("if("+cond+")", block);
    }
    public final void $else_if(String cond, Block block){
        block.code = this;
        this.$("else if("+cond+")", block);
    }
    public final void $else(Block block){
        block.code = this;
        this.$("else", block);
    }
    public final void $(String pre, Block block){
        block.code = this;
        add(pre+"{");
        String lastPre = prefijo;
        prefijo += "\t";
        block.block();
        prefijo = lastPre;
        add("}");
    }

    @Override
    public boolean add(String s) {
        return super.add(prefijo+s);
    }
}
