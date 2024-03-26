/*
 * Red Innovation © 2024.
 *
 * This file (hereafter, the "work") is licensed under the European Union
 * Public Licence, Version 1.2 or later (the "EUPL"). This EUPL applies to this
 * work, which is provided under the terms of this EUPL. You may obtain a copy
 * of this EUPL at:
 *
 *     https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Any use of this work, other than as authorised under this EUPL, is
 * prohibited (to the extent such use is covered by a right of the copyright
 * holder of this work).
 *
 * Author: Mauko Quiroga-Alvarado <mauko@redte.ch>.
 */

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;

public class Load {
    @CEntryPoint public static int load(IsolateThread thread) {
        System.out.println("Hello, World!");
        return 0;
    }
}
