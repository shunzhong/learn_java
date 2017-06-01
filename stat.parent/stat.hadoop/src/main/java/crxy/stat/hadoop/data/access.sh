#!/bin/sh 
source /etc/profile

stat_date=`date -d"yesterday"  +"%Y-%m-%d"`
echo "job begin"
echo `date +"%Y-%m-%d %H:%M:%S"`
cd /opt/work
echo "begin accessCleaner"

sh /opt/work/shell/accessCleaner.sh > /opt/work/logs/accessCleaner.log.${stat_date} 2>&1

echo "end accessCleaner" 


#login
{
echo "begin login"
sh /opt/work/hive_script/app_login_stat.sh > /opt/work/logs/app_login_stat.log.${stat_date} 2>&1
}&
login_pid=$!
echo $login_pid
#uv pv
{
echo "begin uv pv"
sh /opt/work/hive_script/t_stat_app_uv_tbl.sh > /opt/work/logs/t_stat_app_uv_tbl.log.${stat_date} 2>&1
}&
uv_pid=$!
echo $uv_pid
#app_one_remain_stat
{
echo "begin app_one_remain_stat"
sh /opt/work/hive_script/app_one_remain_stat.sh > /opt/work/logs/app_one_remain_stat.log.${stat_date} 2>&1
}&
remain_pid=$!
echo $remain_pid

wait $login_pid
wait $uv_pid
wait $remain_pid

echo "begin kettle"
sh /opt/kettle/data-integration/kitchen.sh -rep file_rep -job J_O_app_core_view_stat -dir /access/core_view -param:stat_date=${stat_date} -level Detailed > /opt/work/kettle_logs/J_O_app_core_view_stat.${stat_date} 2>&1 
echo "end kettle"

echo `date +"%Y-%m-%d %H:%M:%S"`
echo "job end"



