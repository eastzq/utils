package com.zq.utils.cli.intf;

import java.io.File;

import com.zq.utils.cli.ExecuteResult;

public interface CommandExecutor {
	public static final int exErrorCode = -999;

	ExecuteResult executeCommand(String command);

	ExecuteResult executeCommand(String command, long timeout);

	ExecuteResult executeCommand(String[] cmdarray, long timeout, String[] envp, File dir);

	ExecuteResult executeCommand(String[] cmdarray, long timeout);

	ExecuteResult executeCommand(String[] cmdarray);
}
