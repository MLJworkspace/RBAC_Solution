# RoleBasedAccessControl
Role based access control for Ecore-based Metamodels

# Platform and plugins
The solutions has been implemented using Ecore Modeling Tools Eclipse 2021-03. The additional required plugins are: QVTo and Xtext

# Steps for running the example in the video

1- Import in your workspace the following files: 

- se.mdu.view_plugin
 - AccessControlMetamodel
 - AccessControlMetamodel.edit
 - AccessControlMetamodel.editor
 - AccessControlMetamodel.tests
 - org.xtext.example.mapping
 - org.xtext.example.mapping.edit   
- org.xtext.example.mapping.editor
- org.xtext.example.mapping.ide
- org.xtext.example.mapping.tests
- org.xtext.example.mapping.ui.tests
- org.xtext.example.mapping.ui
- UniRunningExample
- UniRunningExample.edit
- UniRunningExample.editor
- Templates

2- Create a new runtime instance and import 

- uniRunningExample2uniRunningExample_view
- UniRunningExample
- uniRunningExample_view
- uniRunningExample_view.edit
- uniRunningExample_view.editor
- uniRunningExample_view.tests

3- Make changes to any of the models (University.xmi) or (uniRunningExample_view.xmi) using their corresponding editors, and use the transformations inside (uniRunningExample2uniRunningExample_view) accordingly to propagate the changes. 

# Steps for applying the solution to your own language

1- Import in your workspace your language and all files mentioned in the prior step except for:

- UniRunningExample
- UniRunningExample.edit
- UniRunningExample.editor

2- Create a new runtime instance and import your language.

3- Create a model conforming to your language. 

4-Follow the steps as in the video.

