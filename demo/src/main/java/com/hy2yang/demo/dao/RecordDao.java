package com.hy2yang.demo.dao;

import com.hy2yang.demo.entity.Record;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.BadSqlGrammarException; 

public interface RecordDao {  
    
    /** 
     *  
     * @return 
     */  
    public List<Record> getAll();  
    /** 
     * 
     * @param user 
     * @return 
     */  
    public Record getRecord(Record p);  
    /** 
     * delete record 
     * @param tablekey 
     * @param id
     * @return 
     */  
    public int delete(@Param("tableKey")String tableKey, @Param("id")int id);  
    /** 
     * update record 
     * @param map 
     * @return 
     */  
    public int update(Map<String,Object> map);  
    /** 
     * add record 
     * @param map 
     * @return 
     */  
    public int add(Map<String,Object> map);  
    
    public int newTable(String tableKey);
    
    public int dropEmpty(String tableKey);
    /** 
     * query 
     * @param map 
     * @return 
     */  
    public List<Record> find(Map<String,Object> map) throws BadSqlGrammarException;  
    /** 
     * get total records of a table 
     * @param map 
     * @return 
     */  
    public Long getTotal(String tableKey) throws BadSqlGrammarException;  
    /** 
     * get record of certain id
     * @param id 
     * @return 
     */  
    public Record getRecordById(int id);  
}  