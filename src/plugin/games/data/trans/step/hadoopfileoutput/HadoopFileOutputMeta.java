/*
 * Copyright 2007 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * @author Michael D'Amour
 */

package plugin.games.data.trans.step.hadoopfileoutput;

import org.pentaho.di.i18n.BaseMessages;

import plugin.games.data.trans.step.fileoutput.TextFileOutputMeta;


public class HadoopFileOutputMeta extends TextFileOutputMeta {

    // for message resolution
    private static Class<?> PKG = HadoopFileOutputMeta.class;
   
    @Override
    public void setDefault()
    {
        //  call the base classes method
        super.setDefault();
        
        // now set the default for the 
        // filename to an empty string
        setFileName("");
        super.setFileAsCommand(false);
    }
    
    @Override
    public void setFileAsCommand(boolean fileAsCommand) {
      //  Don't do anything.  We want to keep this property as false
      //  Throwing a KettleStepException would be desirable but then we 
      //  need to change the base class' method which is 
      //  open source.
       
      throw new RuntimeException(new RuntimeException(BaseMessages.getString(PKG, "HadoopFileOutput.MethodNotSupportedException.Message")));
    }
    
}