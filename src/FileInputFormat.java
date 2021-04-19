public class FileInputFormat {
    /**
     *  job 提交流程 /Users/menglin/IdeaProjects/untitled1/src/FileInputFormat.java
     */
   //  waitForCompletion() ;
   //  submit();
    // 1、建立连接
    //  connect();
    // 1）创建提交job的代理
    // new Cluster(getConfiguration());
    // （1）判断是本地yarn还是远程
    // initialize(jobTrackAddr, conf);
    // 2、提交job
    // submitter.submitJobInternal(Job.this, cluster)
    // 1）创建给集群提交数据的Stag路径
    // Path jobStagingArea = JobSubmissionFiles.getStagingDir(cluster, conf);
    // 2）获取jobid ，并创建job路径    JobID jobId = submitClient.getNewJobID();
    // 3）拷贝jar包到集群    copyAndConfigureFiles(job, submitJobDir);
    // rUploader.uploadFiles(job, jobSubmitDir);
    // 4）计算切片，生成切片规划文件
    // writeSplits(job, submitJobDir);
    // maps = writeNewSplits(job, jobSubmitDir);
    // input.getSplits(job);
    // 5）向Stag路径写xml配置文件
    // writeConf(conf, submitJobFile);
    // conf.writeXml(out);
    // 6）提交job,返回提交状态
    // status = submitClient.submitJob(jobId, submitJobDir.toString(), job.getCredentials());
}
