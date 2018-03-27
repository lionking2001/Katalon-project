<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Registration</name>
   <tag></tag>
   <elementGuidId>4a94f0ab-cb12-4dc1-b293-a10b940ca712</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  
  Registration
  

  
  
  

  
  
/* You can add global styles to this file, and also import other style files */
#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-elementInfoDiv {color: lightblue; padding: 5px}

  

  
    
      Course Registration System
      
        
      
      
        
          Student
        
        
          Lecturer
        
        
          Course
        
        
          Logout
        
      
    
  




  
    
      
        
          
            Profile

            
              
            
            

              Name : Chartchai Doungsa-ard
              Faculty : College of Art Media and Technology 
              Contact : chartchai.d@cmu.ac.th 

            

          

        
      
    
  

  
    
      
        
          
            Lecturer Information
            
              
                
                Name
              
              

              
                
                Surname
              
              

              
                
                Email
              

              

              
              
                
                Date of Birth
              
              

              
                
                Address
              
              

              
                ▼Faculty of HumanitiesFaculty of EducationFaculty of fineartsFaculty of Social ScienceFaculty of ScienceFaculty of EngineerFaculty of MedicineFaculty of AgricultureFaculty of DentistyFaculty of PharmacyFaculty of Associated Medical ScienceFaculty of nursingFaculty of Agro-industryFaculty of Veterinary MedicineFaculty of Business AdministrationFaculty of EconomicFaculty of AgritectureFaculty of Mass-CommunicationFaculty of Political ScienceFaculty of LawCollege of Art Media And Technology
                  Faculty of Humanities
                  Faculty of Education
                  Faculty of finearts
                  Faculty of Social Science
                  Faculty of Science
                  Faculty of Engineer
                  Faculty of Medicine
                  Faculty of Agriculture
                  Faculty of Dentisty
                  Faculty of Pharmacy
                  Faculty of Associated Medical Science
                  Faculty of nursing
                  Faculty of Agro-industry
                  Faculty of Veterinary Medicine
                  Faculty of Business Administration
                  Faculty of Economic
                  Faculty of Agritecture
                  Faculty of Mass-Communication
                  Faculty of Political Science
                  Faculty of Law
                  College of Art Media And Technology

                
                Select Faculty
              


              
                
                Phone Number
              

              

              
              
                
                  Upload File
                  
                
                
                  
                
              

              
                Save
                Cancel
              
            

          
        
      
    
  







  

  
  
  
    $(document).ready(function() {
      $('select').material_select();
    });
  


  
    // Hide Sections
    $('.section').hide();

    setTimeout(function () {
      $(document).ready(function () {
        // Show sections
        $('.section').fadeIn();

        // Hide preloader
        $('.loader').fadeOut();

        //Init Side nav
        $('.button-collapse').sideNav();

        // Init Modal
        $('.modal').modal();

      });
    }, 1000);
  
  
  $('select').material_select();
  
  
    $(document).ready(function () {
      $('.dropdown-button').dropdown({
        constrainWidth: false,
        hover: true,
        belowOrigin: true,
        alignment: 'left'
      });
});

      // JAVASCRIPT START HERE //
      $('.parallax').parallax();
  
  
    $(document).ready(function(){
      $('ul.tabs').tabs('select_tab', 'tab_id');
    });
  
  

    function assign_grade() {
      var val_grade = document.getElementById('val_grade');
      var grade = document.getElementById('grade');
      var btn_assign = document.getElementById('btn_assign');
      var btn_save = document.getElementById('btn_save');
      var btn_cancel = document.getElementById('btn_cancel');
      grade.style.display = 'none';
      val_grade.style.display = '';
      btn_assign.style.display ='none';
      btn_save.style.display = '';
      btn_cancel.style.display = '';

    }
    function save_grade(){
      var val_grade = document.getElementById('val_grade');
      var grade = document.getElementById('grade');
      var btn_assign = document.getElementById('btn_assign');
      var btn_save = document.getElementById('btn_save');
      var btn_cancel = document.getElementById('btn_cancel');
      if(val_grade.value != &quot;&quot;){
        val_grade.style.display = 'none';
        grade.innerHTML = val_grade.value.toUpperCase();
        grade.style.display ='';
        btn_assign.style.display ='';
        btn_save.style.display ='none';
        btn_cancel.style.display = 'none';
      }else{
        alert(&quot;Please input the grade&quot;);
      }



    }
    function cancel_grade(){
      var val_grade = document.getElementById('val_grade');
      var grade = document.getElementById('grade');
      var btn_assign = document.getElementById('btn_assign');
      var btn_save = document.getElementById('btn_save');
      var btn_cancel = document.getElementById('btn_cancel');
      val_grade.style.display = 'none';
      grade.style.display ='';
      btn_assign.style.display ='';
      btn_save.style.display ='none';
      btn_cancel.style.display = 'none';


    }
    function Validate(txt) {
      txt.value = txt.value.replace(/[^a-d,f,A-D-,F'\n\r.]+/g, '');
    }

  


/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
   </webElementProperties>
</WebElementEntity>
