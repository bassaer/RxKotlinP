import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toFlowable
import io.reactivex.rxkotlin.toObservable

fun main(args: Array<String>) {
    val data1 = listOf("alpha", "beta", "gamma", "delta", "epsilon")

    data1.toObservable()
            .filter { it.length >= 5 }
            .subscribeBy(
                    onNext = { println(it)},
                    onError = { it.printStackTrace() },
                    onComplete = { println("Done.")}
            )
    val data2 = (1..10).toList()
    val flowable = data2.toFlowable()
            .filter{it % 2 == 0}
            .map { it * 100 }
    flowable.subscribe{
        println(it)
    }


    flowable.subscribe{
        println(it)
    }
}
