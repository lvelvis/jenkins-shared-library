package com.giant.pipeline

// 实现 Serializable 接口是为了确保当 pipeline 被 Jenkins挂起后能正确恢复
class Utils implements Serializable {
   def createVersion(String BUILD_NUMBER) {
       return new Date().format('yyyyMM') + "-${BUILD_NUMBER}"
   }
}
