/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author crist
 */
public class ProgramSet {

    public static void main(String[] args) {
        // Criando conjuntos com diferentes implementações
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        // Adicionando elementos
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        
        treeSet.addAll(hashSet);
        linkedHashSet.addAll(hashSet);
        
        // Exibindo os conjuntos
        System.out.println("HashSet (ordem não garantida): " + hashSet);
        System.out.println("TreeSet (ordenado): " + treeSet);
        System.out.println("LinkedHashSet (ordem de inserção): " + linkedHashSet);
        
        // Testando operações de conjunto
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "E"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D", "F"));
        
        // União
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("União: " + union);
        
        // Interseção
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Interseção: " + intersection);
        
        // Diferença
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Diferença (set1 - set2): " + difference);
        
        // Verificando se um elemento está no conjunto
        System.out.println("Set1 contém 'A'? " + set1.contains("A"));
        
        // Removendo um elemento
        set1.remove("A");
        System.out.println("Set1 após remover 'A': " + set1);
        
        // Limpar o conjunto
        set1.clear();
        System.out.println("Set1 após clear(): " + set1);
    }
}
