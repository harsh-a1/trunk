package org.hisp.dhis.preheat;

/*
 * Copyright (c) 2004-2016, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import org.hisp.dhis.common.IdentifiableObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Morten Olav Hansen <mortenoh@gmail.com>
 */
public class PreheatParams
{
    private PreheatMode preheatMode = PreheatMode.ALL;

    private PreheatIdentifier preheatIdentifier = PreheatIdentifier.UID;

    private Set<Class<? extends IdentifiableObject>> classes = new HashSet<>();

    private Map<PreheatIdentifier, Map<Class<? extends IdentifiableObject>, Set<String>>> references = new HashMap<>();

    public PreheatParams()
    {
    }

    public PreheatMode getPreheatMode()
    {
        return preheatMode;
    }

    public PreheatParams setPreheatMode( PreheatMode preheatMode )
    {
        this.preheatMode = preheatMode;
        return this;
    }

    public PreheatIdentifier getPreheatIdentifier()
    {
        return preheatIdentifier;
    }

    public PreheatParams setPreheatIdentifier( PreheatIdentifier preheatIdentifier )
    {
        this.preheatIdentifier = preheatIdentifier;
        return this;
    }

    public Set<Class<? extends IdentifiableObject>> getClasses()
    {
        return classes;
    }

    public PreheatParams setClasses( Set<Class<? extends IdentifiableObject>> classes )
    {
        this.classes = classes;
        return this;
    }

    public Map<PreheatIdentifier, Map<Class<? extends IdentifiableObject>, Set<String>>> getReferences()
    {
        return references;
    }

    public PreheatParams setReferences( Map<PreheatIdentifier, Map<Class<? extends IdentifiableObject>, Set<String>>> references )
    {
        this.references = references;
        return this;
    }
}
