package jcrystal.utils;

/**
 * Created by G on 11/8/2016.
 */
public abstract class Block {
    CodeBlock code;
    public abstract void block();
    public final void _$(String ins){
        code.$(ins);
    }
    public final void _$(Block block){
        code.$(block);
    }
    public final void $if(String cond, Block block){
        code.$if(cond, block);
    }
    public final void $else_if(String cond, Block block){
        code.$else_if(cond, block);
    }
    public final void $else(Block block){
        code.$else(block);
    }
    public final void _$(String pre, Block block){
        code.$(pre, block);
    }
    public final void $VoidCatch(String ex){
        code.$("catch("+ex+"){}");
    }
    public final void $SingleCatch(String ex,String p){
        code.$("catch("+ex+"){"+p+"}");
    }
}
