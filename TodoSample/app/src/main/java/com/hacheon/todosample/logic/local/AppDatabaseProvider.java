package com.hacheon.todosample.logic.local;

import android.content.Context;

import androidx.room.Room;

public class AppDatabaseProvider {
    private volatile static LoginAppDataBase INSTANCE =null;
//    private volatile static WriteAppDataBase WRITE_INSTANCE =null;
    //기본 constructor
    private AppDatabaseProvider(){};

    //[START] LOGIN APP DB
    public static LoginAppDataBase getINSTANCE() throws  Exception{
        if(INSTANCE == null){
            throw new Exception("INSTANCE MUST BENOT NULL");
        }

        return INSTANCE;
    }
    public static LoginAppDataBase getINSTACE(Context context) {
        if(INSTANCE == null)
            synchronized (LoginAppDataBase.class){
            INSTANCE = Room.databaseBuilder(context, LoginAppDataBase.class,"db").fallbackToDestructiveMigration().build();
        }

        return INSTANCE;
    }
    //[END] LOGIN APP DB


    //[START] WRITE APP DB
//    public static WriteAppDataBase getWRITE_INSTANCE() throws  Exception{
//        if(WRITE_INSTANCE == null){
//            throw new Exception("INSTANCE MUST BENOT NULL");
//        }
//
//        return WRITE_INSTANCE;
//    }
//
//    public static WriteAppDataBase getWRITE_INSTANCE(Context context) {
//        if(WRITE_INSTANCE == null)
//            synchronized (WriteAppDataBase.class){
//                WRITE_INSTANCE = Room.databaseBuilder(context, WriteAppDataBase.class,"db").fallbackToDestructiveMigration().build();
//            }
//
//        return WRITE_INSTANCE;
//    }
    //[END] WRITE APP DB


}
