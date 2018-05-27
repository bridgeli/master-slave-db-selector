package cn.bridgeli.masterslavedbselector;

import javax.sql.DataSource;

/**
 * 主从选择
 */
public interface MasterSlaveSelector {

    DataSource get();

    /**
     * 设置主库
     */
    void master();

    /**
     * 设置从库
     */
    void slave();

    /**
     * 对数据库资源的监控，每10分钟检测一次
     */
    void monitor();

}