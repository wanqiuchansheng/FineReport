package com.hyp.plugin.workday;

import com.fr.plugin.ExtraClassManager;
import com.fr.script.AbstractFunction;
import com.fr.stable.fun.FunctionProcessor;

public class UpdateWorkDay extends AbstractFunction {
    @Override
    public Object run(Object[] args) {
        FunctionProcessor processor = ExtraClassManager.getInstance().getFunctionProcessor();
        if (processor != null) {
            processor.recordFunction(IsWorkDay.ONEFUNCTION);
        }

        if (args != null) {
            return WorkDayFactory.updateWorkDay(args);
        }
        return false;
    }
}
