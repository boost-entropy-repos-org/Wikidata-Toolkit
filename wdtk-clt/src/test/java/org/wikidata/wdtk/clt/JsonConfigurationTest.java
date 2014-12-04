package org.wikidata.wdtk.clt;

/*
 * #%L
 * Wikidata Toolkit Command-line Tool
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class JsonConfigurationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetDefaultDestination() throws IOException {
		JsonConfiguration jsonConfiguration = new JsonConfiguration(
				new ConversionProperties());

		jsonConfiguration.setDefaultDestination();
		assertEquals(jsonConfiguration.getOutputDestination(),
				"WikidataDump.json");

	}
}