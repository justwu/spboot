package com.just.exception;

/**
 * Created by flyhigh on 2017/6/11.
 */
public class DefinedException extends Exception {
    private String[] args;
    private Integer errorcode = 999;

    public DefinedException() {
        super();
    }

    public DefinedException(Exception e) {
        super(e);
    }

    public DefinedException(String message, String... args) {
        this(message, 999, args);
//		super(message);
//		this.args = args;
    }

    public DefinedException(String msg, Integer errorcode, String... args) {
        super(msg, new Throwable(errorcode + ""));
        this.errorcode = errorcode;
        this.args = args;
    }

//    public DefinedException(String msg, String type) {
//        super(msg, new Throwable(type));
//    }

    public String[] getArgs() {
        return args;
    }

    public String getType() {
        return this.getCause().getMessage();
    }

    public Integer getErrorcode() {
        return this.errorcode;
    }


}

