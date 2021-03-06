/*
 * Copyright 2019 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.numkt.math

import org.jetbrains.numkt.callFunc
import org.jetbrains.numkt.core.KtNDArray

/**
 *
 */
fun <T : Number> signbit(x: KtNDArray<T>): KtNDArray<Boolean> =
    callFunc(nameMethod = arrayOf("signbit"), args = arrayOf(x))

/**
 *
 */
fun <T : Number, E : Number> copysign(x1: KtNDArray<T>, x2: KtNDArray<E>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("copysign"), args = arrayOf(x1, x2), dtype = Double::class)

/**
 *
 */
fun <T : Any> frexp(x: KtNDArray<T>): Pair<KtNDArray<Double>, KtNDArray<Int>> =
    callFunc(
        nameMethod = arrayOf("frexp"),
        args = arrayOf(x),
        kClass = Pair::class
    ) as Pair<KtNDArray<Double>, KtNDArray<Int>>

/**
 *
 */
fun <T : Number, E : Number> ldexp(x1: KtNDArray<T>, x2: KtNDArray<E>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("ldexp"), args = arrayOf(x1, x2), dtype = Double::class)

/**
 *
 */
fun <T : Number, E : Number> nextafter(x1: KtNDArray<T>, x2: KtNDArray<E>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("nextafter"), args = arrayOf(x1, x2), dtype = Double::class)

/**
 *
 */
fun <T : Number> spacing(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("spacing"), args = arrayOf(x), dtype = Double::class)