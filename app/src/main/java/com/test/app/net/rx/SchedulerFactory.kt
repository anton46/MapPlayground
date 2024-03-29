package com.test.app.net.rx

import io.reactivex.Scheduler


class SchedulerFactory(
    private val mainScheduler: Scheduler,
    private val ioScheduler: Scheduler,
    private val computationScheduler: Scheduler,
    private val trampolineScheduler: Scheduler
) : ISchedulerFactory {

    override fun main(): Scheduler = mainScheduler

    override fun io(): Scheduler = ioScheduler

    override fun computation(): Scheduler = computationScheduler

    override fun trampoline(): Scheduler = trampolineScheduler
}
