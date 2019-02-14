/**
 * The MIT License (MIT)
 * Copyright (c) 2018 Microsoft Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.microsoft.azure.cosmosdb.sample;

import com.vormetric.rest.helperclasses.VormetricCryptoServerHelper;
import com.vormetric.rest.helperclasses.VormetricCryptoServerSettings;

public class Families {
 
    public static Family getAndersenFamilyDocument() throws Exception {
        Family andersenFamily = new Family();
        andersenFamily.setId("Andersen-" + System.currentTimeMillis());
        
        String lastname = "Andersen";        
    	String action = "tokenize";
		VormetricCryptoServerSettings vcs = new VormetricCryptoServerSettings();
		vcs.setvcsTokengroup("TextTokenGroup");
		vcs.setvcsTokentemplate("Text");
		String enclastname = VormetricCryptoServerHelper.doTokenizeData(vcs.getvcstokenserver(), vcs.getvcsuserid(),
				vcs.getvcspassword(), vcs.getvcsTokengroup(), vcs.getvcsTokentemplate(), lastname, action);

		andersenFamily.setLastName(enclastname);
		   
		
        Parent parent1 = new Parent();
        parent1.setFirstName("Thomas");

        Parent parent2 = new Parent();
        parent2.setFirstName("Mary Kay");

        andersenFamily.setParents(new Parent[] { parent1, parent2 });

        Child child1 = new Child();
        child1.setFirstName("Henriette Thaulow");
        child1.setGender("female");
        child1.setGrade(5);

        Pet pet1 = new Pet();
        pet1.setGivenName("Fluffy");

        child1.setPets(new Pet[] { pet1 });

        andersenFamily.setDistrict("WA5");
        Address address = new Address();
        address.setCity("Seattle");
        address.setCounty("King");
        address.setState("WA");

        andersenFamily.setAddress(address);
        andersenFamily.setRegistered(true);

        return andersenFamily;
    }

    public static Family getWakefieldFamilyDocument() throws Exception {
        Family wakefieldFamily = new Family();
        wakefieldFamily.setId("Wakefield-" + System.currentTimeMillis());
        
        String lastname = "Wakefield";        
    	String action = "tokenize";
		VormetricCryptoServerSettings vcs = new VormetricCryptoServerSettings();
		vcs.setvcsTokengroup("TextTokenGroup");
		vcs.setvcsTokentemplate("Text");
		String enclastname = VormetricCryptoServerHelper.doTokenizeData(vcs.getvcstokenserver(), vcs.getvcsuserid(),
				vcs.getvcspassword(), vcs.getvcsTokengroup(), vcs.getvcsTokentemplate(), lastname, action);

		
        wakefieldFamily.setLastName(enclastname);

        Parent parent1 = new Parent();
       // parent1.setFamilyName("Wakefield");
         parent1.setFamilyName(enclastname);
        parent1.setFirstName("Robin");

        Parent parent2 = new Parent();
        parent2.setFamilyName("Miller");
        parent2.setFirstName("Ben");

        wakefieldFamily.setParents(new Parent[] { parent1, parent2 });

        Child child1 = new Child();
        child1.setFirstName("Jesse");
        child1.setFamilyName("Merriam");
        child1.setGrade(8);

        Pet pet1 = new Pet();
        pet1.setGivenName("Goofy");

        Pet pet2 = new Pet();
        pet2.setGivenName("Shadow");

        child1.setPets(new Pet[] { pet1, pet2 });

        Child child2 = new Child();
        child2.setFirstName("Lisa");
        child2.setFamilyName("Miller");
        child2.setGrade(1);
        child2.setGender("female");

        wakefieldFamily.setChildren(new Child[] { child1, child2 });

        Address address = new Address();
        address.setCity("NY");
        address.setCounty("Manhattan");
        address.setState("NY");

        wakefieldFamily.setAddress(address);
        wakefieldFamily.setDistrict("NY23");
        wakefieldFamily.setRegistered(true);
        return wakefieldFamily;
    }

    public static Family getJohnsonFamilyDocument() throws Exception {
        Family andersenFamily = new Family();
        andersenFamily.setId("Johnson-" + System.currentTimeMillis());
        
        String lastname = "Johnson";        
    	String action = "tokenize";
		VormetricCryptoServerSettings vcs = new VormetricCryptoServerSettings();
		vcs.setvcsTokengroup("TextTokenGroup");
		vcs.setvcsTokentemplate("Text");
		String enclastname = VormetricCryptoServerHelper.doTokenizeData(vcs.getvcstokenserver(), vcs.getvcsuserid(),
				vcs.getvcspassword(), vcs.getvcsTokengroup(), vcs.getvcsTokentemplate(), lastname, action);
		
        
        andersenFamily.setLastName(enclastname);

        Parent parent1 = new Parent();
        parent1.setFirstName("John");

        Parent parent2 = new Parent();
        parent2.setFirstName("Lili");

        return andersenFamily;
    }
    
    public static Family getSmithFamilyDocument() throws Exception {
        Family andersenFamily = new Family();
        andersenFamily.setId("Smith-" + System.currentTimeMillis());
        
        String lastname = "Smith";        
    	String action = "tokenize";
		VormetricCryptoServerSettings vcs = new VormetricCryptoServerSettings();
		vcs.setvcsTokengroup("TextTokenGroup");
		vcs.setvcsTokentemplate("Text");
		String enclastname = VormetricCryptoServerHelper.doTokenizeData(vcs.getvcstokenserver(), vcs.getvcsuserid(),
				vcs.getvcspassword(), vcs.getvcsTokengroup(), vcs.getvcsTokentemplate(), lastname, action);
        
        andersenFamily.setLastName(enclastname);

        Parent parent1 = new Parent();
        parent1.setFirstName("John");

        Parent parent2 = new Parent();
        parent2.setFirstName("Cynthia");

        return andersenFamily;
    }
}
