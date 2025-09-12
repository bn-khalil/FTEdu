package com.bn.courses.mapper;

public class SectionMapper {
    private LectureMapper lectureMapper;

    public AuthorMapper(LectureMapper lectureMapper) {
        this.lectureMapper = lectureMapper;
    }

    public SectionDTO toSectionDTO(Section section){
        return SectionDTO.builder()
                .id(section.getId())
                .name(section.getName())
                .course(section.getCourse())
                .lectures(section.getLectures())
                .sectionOrder(section.sectionOrder()
                .build();
            
    }

    public Section toAuthor(SectionDTO sectionDTO){
        return Author.builder()
        .id(section.getId())
        .name(section.getName())
        .course(section.getCourse())
        .lectures(section.getLectures())
        .sectionOrder(section.sectionOrder())          
        .build();
    }

    public List<AuthorDTO> toAuthorDTOList(List<Author> authors){
        return authors.stream().map(this::toAuthorDTO).toList();
    }

    public List<Author> toAuthorList(List<AuthorDTO> authorsdto){
        return authorsdto.stream().map(this::toAuthor).toList();
    }
}
