(ns task-cabinet-clj.services.view-tasks)

(defn get-all-tasks [user-name]
  ((keyword user-name) {:john [
              {:task-name "Django の勉強"
               :task-dead "8/1"
               :state "wip"}
              {:task-name "Luminus の勉強"
               :task-dead "8/2"
               :state "todo"}
              {:task-name "出席"
               :stask-dead "8/1"
               :state "done"}
              ]}
        {:holy [
                {:task-name "Vue の勉強"
                 :task-dead "8/1"
                 :state "done"}
                {:task-name "開発環境の準備"
                 :task-dead "8/1"
                 :state "done"}
                {:task-name "出席"
                 :stask-dead "8/1"
                 :state "done"}
                ]}
       ))


