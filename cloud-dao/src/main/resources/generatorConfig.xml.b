<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<!-- 配置生成器 -->
<generatorConfiguration>

    <!--classPathEntry:数据库的JDBC驱动,换成你自己的驱动位置 可选 -->
    <classPathEntry
            location="/Users/threefishes/TFEs/qtf/cloud-repository/mysql-connector-java-8.0.20.jar"/>
    <context id="mysqlTables" targetRuntime="MyBatis3">
        <plugin type="org.mybatis.generator.plugins.RowBoundsPlugin" />
        <!-- 注释 -->
        <commentGenerator>
            <property name="suppressAllComments" value="true"/><!-- 是否取消注释 -->
            <property name="suppressDate" value="true"/> <!-- 是否生成注释代时间戳-->
        </commentGenerator>
        <!--数据库链接地址账号密码-->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost/qtf?characterEncoding=UTF-8"
                        userId="root" password="collec">
        </jdbcConnection>
        <!-- 类型转换 -->
        <javaTypeResolver>
            <!-- 是否使用bigDecimal， false可自动转化以下类型（Long, Integer, Short, etc.） -->
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>

        <!-- 生成Model类存放位置 -->
        <javaModelGenerator targetPackage="cn.threefishes.cloudrepository.entity"
                            targetProject="${javaModelGenerator.targetProject}">
            <property name="enableSubPackages" value="true"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>

        <!-- 生成map.xml文件存放地址 -->
        <sqlMapGenerator targetPackage="mapper"
                         targetProject="${sqlMapGenerator.targetProject}">
            <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator>

        <!-- 生成接口dao -->
        <javaClientGenerator type="XMLMAPPER"
                             targetPackage="cn.threefishes.cloudrepository.dao"
                             targetProject="${javaClientGenerator.targetProject}">
            <property name="enableSubPackages" value="false"/>
        </javaClientGenerator>
        <!--要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->
        <table tableName="activity" domainObjectName="Activity" enableCountByExample="true"
               enableUpdateByExample="true" enableDeleteByExample="true"
               enableSelectByExample="true" selectByExampleQueryId="true">
            
        </table>
        
        

        
    </context></generatorConfiguration>