package io.mishka.notes.ml

import ai.djl.Application
import ai.djl.engine.Engine
import ai.djl.modality.nlp.qa.QAInput
import ai.djl.repository.zoo.Criteria
import ai.djl.training.util.ProgressBar

object DuckGPT {

    private val criteria = Criteria.builder()
            .optApplication(Application.NLP.QUESTION_ANSWER)
            .setTypes(QAInput::class.java, String::class.java)
            .optFilter("backbone", "bert")
            .optEngine(Engine.getDefaultEngineName())
            .optProgress(ProgressBar())
            .build()

    fun generateSimilar(question: String, description: String): String {
        println("Get question - $question")
        return try {
            val model = criteria.loadModel()
            val prediction = model.newPredictor()
            prediction.predict(QAInput(question, description))
        } catch (e: Exception){
            println("Error: ${e.message}")
            "Sorry, but I didn't find the answer :("
        }
    }
}