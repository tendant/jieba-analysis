(ns jieba.segmenter
  (:import [com.huaban.analysis.jieba JiebaSegmenter JiebaSegmenter$SegMode]))

(def index-mode JiebaSegmenter$SegMode/INDEX)

(def search-mode JiebaSegmenter$SegMode/SEARCH)

(defn seg-token->m
  [seg-token]
  {:word (.word seg-token)
   :start-offset (.startOffset seg-token)
   :end-offset (.endOffset seg-token)})

(def segmenter (JiebaSegmenter.))

(defn process
  ([s]
   (map seg-token->m (.process segmenter s index-mode)))
  ([s mode]
   (map seg-token->m (.process segmenter s mode))))
