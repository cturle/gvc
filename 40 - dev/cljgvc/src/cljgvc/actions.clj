(ns cljgvc.actions)


(defn state
  [existe-modifs-ctr-dans-EdT
   existe-modifs-Ctr-dans-EdT
   existe-modifs-CTR-dans-EdT
   existe-modifs-rsq-dans-EdT
   existe-modifs-Rsq-dans-EdT
   existe-modifs-RSQ-dans-EdT
   existe-modifs-ctr-dans-Aj
   existe-modifs-Ctr-dans-Aj
   existe-modifs-CTR-dans-Aj
   existe-modifs-rsq-dans-Aj
   existe-modifs-Rsq-dans-Aj
   existe-modifs-RSQ-dans-Aj ]

  [existe-modifs-ctr-dans-EdT, existe-modifs-Ctr-dans-EdT, existe-modifs-CTR-dans-EdT
   existe-modifs-rsq-dans-EdT, existe-modifs-Rsq-dans-EdT, existe-modifs-RSQ-dans-EdT
   existe-modifs-ctr-dans-Aj,  existe-modifs-Ctr-dans-Aj,  existe-modifs-CTR-dans-Aj
   existe-modifs-rsq-dans-Aj,  existe-modifs-Rsq-dans-Aj,  existe-modifs-RSQ-dans-Aj ])

(def etat-initial (state 0 0 0 0 0 0 0 0 0 0 0 0))

(def actions
  [{:id          :etablir-niv-contrat
    :allowed?    x
    :next-state  y }
   ])

