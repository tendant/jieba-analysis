(ns user
  (:require [jieba.segmenter :as segmenter]))

(def segmenter (JiebaSegmenter.))

(comment
  (segmenter/process "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。")
  (segmenter/process "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。" segmenter/search-mode)

  )