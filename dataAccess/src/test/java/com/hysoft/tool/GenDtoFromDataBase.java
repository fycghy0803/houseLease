package com.hysoft.tool;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yulifan on 2017/6/6.
 */
public class GenDtoFromDataBase {
   //@Test
   public void genDo() throws Exception{
     List<String> warnings = new ArrayList<String>();
     boolean overwrite = true;
     String fileName = "/Users/yulifan/Workspaces/houseLease/dataAccess/src/main/resources/generatorConfig.xml";
     File configFile = new File(fileName);
     ConfigurationParser cp = new ConfigurationParser(warnings);
     Configuration config = cp.parseConfiguration(configFile);
     DefaultShellCallback callback = new DefaultShellCallback(overwrite);
     MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
     myBatisGenerator.generate(null);
   }
}
