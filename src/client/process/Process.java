package client.process;

import client.entity.Context;

public interface Process {
    public void execute(Context context) throws Exception;
}
